public class BinarySearchTree {
    public void preOrder(Node root){//root, left,right
        if (root == null){
            return;
        }
        //duyệt gốc
        System.out.print(root.value + "\t");
        //duyệt bên trái
        preOrder(root.left);
        //duyệt bên phải
        preOrder(root.right);
    }
    public void inOrder(Node root){//left, root,right
        if (root==null){
            return;
        }
        //duyệt bên trái
        inOrder(root.left);
        //duyệt gốc
        System.out.print(root.value + "\t");
        //bên phải
        inOrder(root.right);
    }
    public void postOder(Node root){//left, right,root
        if (root==null){
            return;
        }
        //duyệt bên trái
        inOrder(root.left);
        //bên phải
        inOrder(root.right);
        //duyệt gốc
        System.out.print(root.value + "\t");
    }

    //insert dùng vong lặp while
    public Node insert(Node root,int value){
        //th1 root =null
        Node newNode = new Node(value);
        if(root ==null){
            root = newNode;
            return root;
        }else {
            Node temp = root;
            while (true) {
                if (value > temp.value) {//value nằm bên phải
                    if (temp.right == null){
                        temp.right = newNode;
                        break;
                    }else {
                        temp = temp.right;
                    }
                }else {//value nằm bên trái
                    if (temp.left == null){
                        temp.left = newNode;
                        break;
                    }else {
                        temp = temp.left;
                    }

                }
            }
            return root;
        }
    }

    //insert by deque
    public Node insertbydeQue(Node root,int value){
        Node newNode = new Node(value);
        if (root == null){
            return newNode;
        }
        if (value > root.value){
            if (root.right == null){
                root.right = newNode;
            }else {
                insertbydeQue(root.right,value);
            }
        }else {
            if (root.left == null){
                root.left = newNode;
            }else {
                insertbydeQue(root.left,value);
            }
        }
        return root;
    }

    public Node remove(Node root, int key){
        if (root == null){
            return null;
        }
        //b1 tìm node cần xóa
        if (key < root.value){
            //Node cần xóa nằm bên trái
            root.left = remove(root.left,key);
        } else if (key > root.value) {
            //node cần xóa ở bên phải
            root.right = remove(root.right,key);
        }else {
            //TH1: Node cần xóa là Node-lá
            if (root.left == null && root.right == null){
                return null;
            }
            //TH2: Node cần xóa có 1 Node con
            if (root.left != null && root.right == null){
                return root.left;
            }
            //TH3: Node cần xóa có 2 node con

        }
        return root;
    }
    public Node findleftNode(Node root){
        if(root == null){
            return null;
        }
        return null;
    }
}
