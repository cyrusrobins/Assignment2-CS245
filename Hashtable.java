public class Hashtable {

    private HashNode head;

    public Hashtable(){
        head = null;
    }

    public Boolean containsKey(String key) {
        HashNode curr = head;
        while(curr!=null){
            if(curr.key==key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    public String get(String key) {
        HashNode curr = head;
        while(curr!=null){
            if(curr.key.equals(key))
                return curr.value;
            curr = curr.next;
        }
        return null;
    }

    public void put(String key, String value){
        HashNode curr = head;
        if(curr==null)
            head = new HashNode(key, value);
        else {
            while (curr != null) {
                if (curr.key.equals(key)) {
                    curr.value = value;
                    return;
                } else {
                    curr = curr.next;
                }
            }
        }
    }

    public String remove(String key){
        HashNode curr = head;
        try {
            if (curr.key.equals(key)) {
                String returnValue = curr.value;
                head = head.next;
                return returnValue;
            }
            while (curr.next != null) {
                if (curr.next.key.equals(key)) {
                    String returnValue = curr.next.value;
                    curr.next = curr.next.next;
                    return returnValue;
                } else {
                    curr = curr.next;
                }
            }
            throw new IndexOutOfBoundsException("The key you are looking for is not in the list!");
        }
        catch(IndexOutOfBoundsException oob){
            System.out.println(oob.getMessage());
        }
        return null;
    }
}
