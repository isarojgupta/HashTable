package dsProject;

public class StdList {
    private Node head;

    public StdList(){
        head = new Node();
        head.data = null;
        head.next = null;

    }
    public boolean insertData(Student std){
        Node node = new Node();
        node.data =  std;
        node.next = head.next;
        head.next = node;
        return true;
    }
    public boolean haveRollNo(String rollNo){
        Node temp = head.next;
        boolean have = false;
        while (temp != null){
            if (rollNo.equals(temp.data.getRoll_no())) {
                have = true;
            }
            temp = temp.next;
        }
        return have;
    }
    public Student fetchData(String rollNo){
        Student data = null;
        Node temp =  head.next;
        while (temp != null){
            if (temp.data.getRoll_no().equals(rollNo)){
                data = temp.data;
                break;
            }
            temp = temp.next;
        }
        return data;
    }
    public void deleteData(String rollNo){
        Node x = head;
        Node y = head.next;
        if (head.next.data.getRoll_no().equals(rollNo)) head = y.next;
        else {
            while (true){
                if (y == null || y.data.getRoll_no().equals(rollNo)){
                    break;
                }
                x = y;
                y = y.next;
            }
            if (y!= null){
                x.next = y.next;
                System.out.println("data Deleted");
            }else{
                System.out.println("Data not found");
            }
        }
    }
    public void showData(){
        Node temp = head.next;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    class Node{
        private Student data;
        private Node next;
    }


}
