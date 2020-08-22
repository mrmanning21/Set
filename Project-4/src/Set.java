public class Set {

	//Head node creation.
    private LinkedNode headNode;

    //Constructor.
    public Set () {
    headNode = null;
}
    //Adding numbers (method)
    public void add (int x) {

          	if (!exists (x)) {
          		LinkedNode node = new LinkedNode (x);
          		node.setNext (headNode);

                headNode = node;
            }
      }

    //Method for deleting numbers.
    public void delete (int x) {

          if (headNode != null) {

                if (headNode.getData () == x) {

                      headNode = headNode.getNext ();

                  } 
                else {

                      LinkedNode link = headNode;

                      while (link.getNext () != null) {

                            if (link.getNext ().getData () == x) {
                                  link.setNext (link.getNext ().getNext ());
                                  break;
                              }
                            link = link.getNext ();
                        }
                  }
            }
    }
    
    //Method for checking to see if a number actually exists.
    public boolean exists (int x) {

          LinkedNode link = headNode;

          while (link != null) {

                if (link.getData () == x) {
                      return true;
                  }
                link = link.getNext ();
            }
          //Returning true or false.
          return false;
      }

    public String toString () {

         String str = "";
         LinkedNode link = headNode;

         while (link != null) {
               str += link.getData () + " ";
               link = link.getNext ();
            }
         return str;
      }

}


