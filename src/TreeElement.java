public class TreeElement {
    public TreeElement smallerChild;
    public TreeElement biggerChild;
    public Integer value;

    public TreeElement(TreeElement parentElement, TreeElement leftChild, TreeElement rightChild, Integer value) {
        this.smallerChild = leftChild;
        this.biggerChild = rightChild;
        this.value = value;
    }

    public TreeElement(Integer value) {
        this.value = value;
    }
}
