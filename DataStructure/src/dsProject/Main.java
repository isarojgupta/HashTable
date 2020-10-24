package dsProject;

public class Main {
    public static void main(String[] args) {


        HashTable hashTable = new HashTable();

        Student student1 = new Student("Saroj Gupta", "0187cs181128", 7.8);
        Student student2 = new Student("Aditya Pathak", "0187cs181009", 7.3);
        Student student3 = new Student("Poonam kanaujiya", "0187cs181153", 8.8);
        Student student4 = new Student("Aditya kumar", "0187cs181008", 7.7);

        int std1Key = hashTable.toHashTable(student1.getRoll_no());
        int std2Key = hashTable.toHashTable(student2.getRoll_no());
        int std3Key = hashTable.toHashTable(student3.getRoll_no());
        int std4Key = hashTable.toHashTable(student4.getRoll_no());

        hashTable.insert(std1Key,student1);
        hashTable.insert(std2Key,student2);
        hashTable.insert(std3Key,student3);
        hashTable.insert(std4Key,student4);

//        hashTable.showAllData();
        System.out.println(hashTable.fetchStdInfo("0187cs181128"));
    }
}
