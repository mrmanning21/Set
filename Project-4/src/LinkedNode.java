public class LinkedNode {

	//Pointing to the nodes and data.
    private int data;
    private LinkedNode nextNode;

    public LinkedNode (int data) {

          this.data = data;
          nextNode = null;
      }

     

    public int getData () {
          return data;
      }

    public void setData (int str) {
          this.data = data;
      }

    public LinkedNode getNext () {
          return nextNode;
      }

    public void setNext (LinkedNode nextNode) {
          this.nextNode = nextNode;
      }
   

}