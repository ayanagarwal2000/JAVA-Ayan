import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;

public class Graphs {
	public class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;

		Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
		}

		public boolean equals(Object other) {
			Vertex ov = (Vertex) other;
			return this.name.equals(ov.name);
		}

		public void display() {
			String str = "";
			str = str + this.name + "=>";

			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
			}
			str = str + " END";
			System.out.println(str);
		}
	}

	HashMap<String, Vertex> vtces;

	Graphs() {
		this.vtces = new HashMap<>();
	}

	public int numVertices() {
		return this.vtces.size();
	}

	public void addVertex(String name) {
		if (vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);
	}

	public void removeVertex(String name) {
		if (!vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = this.vtces.get(name);
		Set<Vertex> nbrs = vtx.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			nbr.nbrs.remove(vtx);
		}

		this.vtces.remove(name);
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);
	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);
	}

	public int numEdges() {
		int rv = 0;
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			rv = rv + vtx.nbrs.size();
		}

		rv = rv / 2;

		return rv;
	}

	public void display() {
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			vtx.display();
		}
	}

	public boolean hasPath(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		return this.hasPathDFSI(vtx1, vtx2, explored);
	}

	private boolean hasPath(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		if (!explored.containsKey(vtx1)) {
			explored.put(vtx1, true);
		} else {
			return false;
		}

		if (vtx1.nbrs.containsKey(vtx2)) {
			return true;
		}

		Set<Vertex> nbrs = vtx1.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			if (this.hasPath(nbr, vtx2, explored)) {
				return true;
			}
		}

		return false;

	}

	private boolean hasPathBFS(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		LinkedList<Vertex> queue = new LinkedList<>();
		queue.add(vtx1);
		while (!queue.isEmpty()) {
			Vertex rv = queue.remove();
			if (!explored.containsKey(rv)) {
				explored.put(rv, true);
				if (rv.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}
		return false;
	}

	private boolean hasPathDFSI(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		LinkedList<Vertex> stack = new LinkedList<>();
		stack.addFirst(vtx1);
		while (!stack.isEmpty()) {
			Vertex rv = stack.removeFirst();
			if (!explored.containsKey(rv)) {
				explored.put(rv, true);
				if (rv.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}
				}
			}
		}
		return false;
	}

	public void bft() {
		LinkedList<Vertex> queue = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);
			}
			while (!queue.isEmpty()) {
				Vertex rv = queue.remove();
				if (!explored.containsKey(rv)) {
					explored.put(rv, true);
					System.out.print(rv.name);
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}
	}

	public void dft() {
		LinkedList<Vertex> stack = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				stack.addFirst(vtx);
			}
			while (!stack.isEmpty()) {
				Vertex rv = stack.removeFirst();
				if (!explored.containsKey(rv)) {
					explored.put(rv, true);
					System.out.print(rv.name);
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}
				}
			}
		}
	}

	public boolean isConnected() {
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		queue.add((Vertex) vtces.toArray()[0]);
		while (!queue.isEmpty()) {
			Vertex rv = queue.remove();
			if (!explored.containsKey(rv)) {
				explored.put(rv, true);
				// System.out.print(rv.name);
				Set<Vertex> nbrs = rv.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					if (!explored.containsKey(nbr)) {
						queue.add(nbr);
					}
				}
			}
		}

		return this.vtces.size() == explored.size();

	}

	public ArrayList<ArrayList<String>> getCC() {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		for (Vertex vtx : vtces) {
			ArrayList<String> cc = new ArrayList<>();
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);
			}
			while (!queue.isEmpty()) {
				Vertex rv = queue.removeFirst();
				if (!explored.containsKey(rv)) {
					explored.put(rv, true);
					cc.add(rv.name);
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
			if (cc.size() != 0) {
				ans.add(cc);
			}
		}

		return ans;

	}

	public boolean isBipartite() {
		HashMap<Vertex, String> explored = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				Pair p = new Pair();
				p.vtx = vtx;
				p.vtxcolor = "Red";
				p.reason = null;
				stack.addFirst(p);
			}
			while (!stack.isEmpty()) {
				Pair rp = stack.removeFirst();
				if (!explored.containsKey(rp.vtx)) {
					explored.put(rp.vtx, rp.vtxcolor);
					Set<Vertex> nbrs = rp.vtx.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							Pair nbpair = new Pair();
							nbpair.vtx = nbr;
							nbpair.reason = rp.vtx;
							if (rp.vtxcolor.equals("Red")) {
								nbpair.vtxcolor = "Green";
							} else {
								nbpair.vtxcolor = "Red";
							}
							stack.addFirst(nbpair);
						} else {
							if (rp.vtxcolor.equals(explored.get(nbr))) {
								return false;
							}
						}
					}
				}
			}

		}

		return true;
	}

	private class Pair {
		Vertex vtx;
		String vtxcolor;
		Vertex reason;
	}
	
	
	public void Dijkstra(String source, String dest) {

		Queue<Vertex> queue = new LinkedList<>();
		HashMap<String, Integer> distance = new HashMap<>();
		HashMap<String, Vertex> selected = new HashMap<>();

		Vertex vtx1 = vtces.get(source);
		distance.put(source, 0);
		queue.add(vtx1);

		while (!queue.isEmpty()) {
			Vertex temp = queue.remove();
			selected.put(temp.name, temp);

			Vertex next = temp;
			int minval = Integer.MAX_VALUE;

			Set<Entry<Vertex, Integer>> entries = temp.nbrs.entrySet();
			for (Entry<Vertex, Integer> e : entries) {
				if (!selected.containsKey(e.getKey().name)) {
					if (distance.containsKey(e.getKey().name)) {
						int predis = distance.get(e.getKey().name);
						int newdis = distance.get(temp.name) + e.getValue();

						if (predis > newdis) {
							distance.put(e.getKey().name, newdis);
						}

					} else {

						int newdis = distance.get(temp.name) + e.getValue();
						distance.put(e.getKey().name, newdis);

					}

					if (minval > distance.get(e.getKey().name)) {
						next = e.getKey();
						minval = distance.get(e.getKey().name);
					}

				}

			}

			if (next != temp)
				queue.add(next);

		}

		System.out.println(distance.get(dest));

	}

}