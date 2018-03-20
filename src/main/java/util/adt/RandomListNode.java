package util.adt;

public class RandomListNode {

    public int label;

    public RandomListNode next;

    public RandomListNode random;

    public RandomListNode(int val) {
        this.label = val;
    }

    public RandomListNode(int val, RandomListNode next) {
        this.label = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "RandomListNode{" +
                "val=" + label +
                ", next=" + next +
                ", random=" + random +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RandomListNode that = (RandomListNode) o;

        if (label != that.label) return false;
        if (next != null ? !next.equals(that.next) : that.next != null) return false;
        return random != null ? random.equals(that.random) : that.random == null;
    }

    @Override
    public int hashCode() {
        int result = label;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (random != null ? random.hashCode() : 0);
        return result;
    }

}
