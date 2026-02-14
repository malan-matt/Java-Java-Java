public class List {

  private class Node {
    int value;
    Node next;

    Node(int val) {
      value = val;
      next = null;
    }
  }

  Node first;
  int size;

  public List() {
    first = null;
    size = 0;
  }

  public List(int x) {
    first = new Node(x);
    size = 1;
  }

  public void add(int x) {
    size++;
    if (first == null) {
      first = new Node(x);
      return;
    } else {
      Node check = first;
      while (check.next != null) {
        check = check.next;
      }
      check.next = new Node(x);
      return;
    }
  }

  public String printlist() {
    if (first == null) {
      return "Empty List";
    } else {
      Node check = first;
      String print = "";
      while (check != null) {
        print = print + " " + Integer.toString(check.value);
        check = check.next;
      }
      System.out.println(print);
      return print;
    }
  }

}
