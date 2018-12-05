public class HashNode {
    protected String key;
    protected String value;
    protected int hashCode;
    protected HashNode next;

    public HashNode(String key, String value){
        this.key = key;
        this.value = value;
        next = null;
        hashCode = Math.abs(this.key.hashCode());
    }
}
