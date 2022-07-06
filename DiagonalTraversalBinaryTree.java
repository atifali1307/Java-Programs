class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> result=new ArrayList<>();
           if(root==null)
                return result;
            ArrayDeque<Node> x=new ArrayDeque<>();
            x.addLast(root);
            while(!x.isEmpty()){
                Node curr=x.removeFirst();
                while(curr!=null){
                    result.add(curr.data);
                    if(curr.left!=null)
                        x.addLast(curr.left);
                        curr=curr.right;
                }
            }
            return result;
      }
}
