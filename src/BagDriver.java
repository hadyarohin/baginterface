
public class BagDriver {
	public static void main(String[] args) {
        ResizableArrayBag<Integer> bag1 = new ResizableArrayBag<>();
        bag1.add(1);
        bag1.add(2);
        bag1.add(2);
        bag1.add(3);

        ResizableArrayBag<Integer> bag2 = new ResizableArrayBag<>();
        bag2.add(2);
        bag2.add(3);
        bag2.add(4);

        System.out.println("Bag 1: " + bag1.toList());
        System.out.println("Bag 2: " + bag2.toList());

        BagInterface<Integer> unionResult = bag1.union(bag2);
        System.out.println("Union: " + unionResult.toList());

        BagInterface<Integer> intersectionResult = bag1.intersection(bag2);
        System.out.println("Intersection: " + intersectionResult.toList());

        BagInterface<Integer> differenceResult = bag1.difference(bag2);
        System.out.println("Difference: " + differenceResult.toList());
    }
}

