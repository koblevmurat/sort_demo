
public class SortedArray {
    private TreeElement initialElement;
    private Integer arraySize;
    private Integer sortedArraySize;
    private Integer[] sortedArray;

    public SortedArray(int size){
           this.arraySize = size;
    }

    public void Add(Integer value){
        if (initialElement==null){
            initialElement = new TreeElement(value);
        }
        else {
            AddElement(new TreeElement(value), initialElement);
        }
    }

    private void AddElement(TreeElement newElement, TreeElement parentElement){
        if (newElement.value<parentElement.value) {
            if (parentElement.smallerChild==null){
                parentElement.smallerChild = newElement;
            } else {
                AddElement(newElement, parentElement.smallerChild);
            }
        } else if (newElement.value>parentElement.value){
            if (parentElement.biggerChild==null){
                parentElement.biggerChild = newElement;
            } else {
                AddElement(newElement, parentElement.biggerChild);
            }
        }
    }

    private void sortArray(TreeElement element ){
        if (element.smallerChild !=null){
            sortArray(element.smallerChild);
        }
        this.sortedArray[sortedArraySize] = element.value;
        this.sortedArraySize+=1;

        if (element.biggerChild!=null) {
            sortArray(element.biggerChild);
        }
    }

    public Integer[] getSortedArray() {
        this.sortedArray = new Integer[arraySize];
        sortedArraySize = 0;
        sortArray(initialElement);
        return sortedArray;
    }
}
