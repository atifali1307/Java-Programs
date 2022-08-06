// Quick Sort on Doubly Linked List

class GfG
{
    public static Node partition(Node l, Node h)
    {
        //code here.
        Node pivot=h;
        Node i=l;
        for(Node j=l;j!=h;j=j.next){
            if(pivot.data>j.data){
                swap(j,i);
                i=i.next;
            }
        }
        swap(i,h);
        return i;
    }
    public static void swap(Node x,Node y){
        int temp=x.data;
        x.data=y.data;
        y.data=temp;
    }
}