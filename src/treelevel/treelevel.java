package treelevel;

public class treelevel {

	public static void main(String[] args) {
		//		String str;
		TNode A = new TNode("A");
		TNode B = new TNode("B");
		TNode D = new TNode("D");
		TNode G = new TNode("G");
		TNode H = new TNode("H");
		TNode C = new TNode("C");
		TNode F = new TNode("F");
		A.setLeft(B);
		A.setRight(D);
		B.setLeft(G);
		B.setRight(H);
		D.setLeft(C);
		D.setRight(F);
		treeLevel(A, 3);
		//     	System.out.println(str);
	}

	//	public static StringBuilder str=new StringBuilder();
	public static void treeLevel(TNode tree, int n) {
		if (n < 0) {
			System.out.println("The tree is not exist!");
		}
		else if (n == 1) {
			System.out.println(tree.value);
			/*			str.append(tree.value);
						return str.toString();*/
		}
		else {
			treeLevel(tree.left, n - 1);
			treeLevel(tree.right, n - 1);
		}
	}
}

class TNode {
	String value;

	public TNode left;

	public TNode right;

	public TNode(String ch) {
		this.value = ch;
		this.setLeft(null);
		this.setRight(null);
	}

	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}
}