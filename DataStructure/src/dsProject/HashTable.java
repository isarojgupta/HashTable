package dsProject;

public class HashTable {
    private StdList[] arr;
    private int size;
    private int totalStudents;

    public HashTable(){
        size = 1000;
        arr = new StdList[size];
    }
    public int toHashTable(String rollNo){
        int addAsciis = 0;
        int codeValue = 0;
        for (int i = 0; i<rollNo.length();i++){
            addAsciis += (int)rollNo.charAt(i);
        }
        codeValue = addAsciis % arr.length;
        return codeValue;
    }
    public boolean insert(int key, Student data){
        if (arr[key] == null){
            arr[key] = new StdList();
        }
        arr[key].insertData(data);
        totalStudents++;
        return true;
    }
    public Student fetchStdInfo(String rollNo){
        int key = toHashTable(rollNo);
        if (arr[key] == null){
            return null;
        }else{
            Student q = arr[key].fetchData(rollNo);
            if (q != null){
                return q;

            }else {
                return null;
            }
        }
    }

    public boolean deleteData(String rollNo){
        boolean have = arr[toHashTable(rollNo)].haveRollNo(rollNo);
        if (have){
            int key = toHashTable(rollNo);
            arr[key].deleteData(rollNo);
            totalStudents--;
        return true;
        }
            return false;

    }
public void showAllData(){
        for (int i = 0;i< arr.length;i++){
            if (arr[i] != null){
                arr[i].showData();
            }
        }
}

}
