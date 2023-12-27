import java.util.*;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class TypeList {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(0,new GroceryItem("Milk"));
//        groceryList.add("Yogurt");
        groceryList.set(1,new GroceryItem("Milk"));
        groceryList.remove(1);

        System.out.println(groceryList);

        String[] items = {"apples","bananas"};
//        transform array string to list string (become immutable)
        List<String> list = List.of(items);
//        list.add("yogurt");
        System.out.println(list);

//        new mutable ArrayList, populated with the element from the immutable list we passed
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles","mustard")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        if(groceries.contains("mustard")){
            System.out.println("mustard");
        }

        groceries.add("yogurt");
        System.out.println(groceries.indexOf("yogurt"));
        System.out.println(groceries.lastIndexOf("yogurt"));

        groceries.remove(1);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("yogurt"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries.isEmpty());

        groceries.addAll(List.of("apple","milk","mustard"));
        groceries.addAll(Arrays.asList("eggs","pickles"));

        groceries.sort(Comparator.naturalOrder());
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArrayCast =  groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArrayCast));

        String[] originalArray = new String[] {"first"};
        var originalList = Arrays.asList(originalArray);
        originalList.set(0, "one");
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("1");
        placesToVisit.add(0,"2");
        placesToVisit.addFirst("3");
        placesToVisit.addLast("4");
        placesToVisit.offer("5");
        placesToVisit.offerFirst("6");
        placesToVisit.offerLast("7");
        placesToVisit.push("8");
        placesToVisit.remove(0);
        System.out.println(placesToVisit);
        placesToVisit.remove("1");
        System.out.println(placesToVisit);
        placesToVisit.remove();
        System.out.println(placesToVisit);
        placesToVisit.removeFirst();
        System.out.println(placesToVisit);
        placesToVisit.removeLast();
        System.out.println(placesToVisit);
        placesToVisit.poll();
        System.out.println(placesToVisit);
        placesToVisit.pop();
        System.out.println(placesToVisit);
        placesToVisit.add("6");
        placesToVisit.add("7");
        System.out.println(placesToVisit);
        System.out.println(placesToVisit.get(2));
        System.out.println(placesToVisit.getFirst());
        System.out.println(placesToVisit.getLast());
        System.out.println(placesToVisit.indexOf("7"));
        System.out.println(placesToVisit.lastIndexOf("7"));
//        queue retrieval method
        System.out.println(placesToVisit.element());
//        stack retrieval method
        System.out.println(placesToVisit.peek());

        Iterator<String> iterator = placesToVisit.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("5")){
                iterator.remove();
            }
        }
        System.out.println(placesToVisit);

        ListIterator<String> listIterator = placesToVisit.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equals("7")){
                listIterator.add("8");
            }
        }
        System.out.println(placesToVisit);
        while (listIterator.hasPrevious()){
            if(listIterator.previous().equals("6")){
                listIterator.add("5");
            }
        }
        System.out.println(placesToVisit);

    }
}

/*
list
-> special type in java, called an interface
-> list interface describes a set of method signatures, that all list classes are expected to have

all known implementing classes
-> AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector

ArrayList
-> a class, that really maintains an array in memory, that's actually bigger than what we need, in most cases
-> it keeps track of the capacity which is the actual size of the array in memory
-> but it also keeps track of the elements that've been assigned or set, which is the size of the arraylist
-> as elements are added to an arraylist, its capacity may need to grow. this all happens automatically
-> this is why the arraylist resizeable

declaring array with a specific type, allows compile-time type checking
which prevent runtime exception, when instances assigned to array, aren't what they are expected to be

raw list
ArrayList objectList = new ArrayList();

list with argument type
ArrayList<GroceryItem> groceryList = new ArrayList<>();

ArrayList<> -> diamond operator

Array vs ArrayList
primitive type support -> Array
indexed -> both
ordered by index -> both
duplicates allowed -> both
nulls allowed -> both
resizable -> ArrayList
mutable -> yes
inherit from java.util.Object -> both
implements List interface -> ArrayList

instantiating arrays -> String[] array = new String[10];
String[] array = new String[] {"first"};
String[][] array2d = {{"first"},{"second"}};
an array of 10 element is created, all with null references. the compiler will only permit string to be assigned to the elements

instantiating ArrayList -> ArrayList<String> arrayList = new ArrayList<>();
ArrayList<String> arrayList = new ArrayList<>(List.of("first));
ArrayList<ArrayList<String>> multiDList = new ArrayList<>();
an empty arraylist is created, the compiler will check that only string are added to the arraylist

returned list is not resizeable, but is mutable
var newList = Arrays.asList("Sunday");
String[] days = new String[] {"Sunday"};
List<String> newList = Arrays.asList(days);

returned list is immutable
var listOne = List.of("Sunday");
String[] days = new String[] {"Sunday"};
List<String> listOne = List.of(days);

o(1) -> constant time
o(n) -> linear time
o(1)* -> constant amortized time - somewhere betwwen o(1) and o(n), but closer to o(1) as effiencies ar gained

arraylist index is an int type so array list capacity is limited to Integer.MAX_VALUE

arraylist
-> indexed
-> remove an element, the reference address have to be re-indexed, or shifted
-> adding an element, the array that backs the arraylist might be to small and might need to be reallocated
-> implemented on top of an array

linkedlist
-> not indexed
-> implemented using doubly linked list

iterator is similar to for and enhanced for loop

interator is forward only, and only support the remove method
listIterator can be used to go both forwards and backwards, and in addition to the remove method, it also supports the add and set methods
*/