public class SortingStudentsByGPA implements Comparator {
    @Override
    public void insertionSort(Student[] arr) {
        for(int i = 1; i < arr.length; i++){
            Student currElem = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey].getGpa() < currElem.getGpa()){
                arr[prevKey+1] = arr[prevKey];
                prevKey--;}
            
            arr[prevKey+1] = currElem;}
    }

    public void SortStudentsByGPA(Student[] students)
    {insertionSort(students);}
}