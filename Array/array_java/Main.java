
import models.ArrayManager;
import operations.DeleteOperation;
import operations.InsertOperation;
import operations.ModifyOperation;
import operations.SearchOperation;
import operations.TraverseOperation;
import utils.ArrayUtility;

public class Main {

        public static void main(String[] args) {

                ArrayManager manager = new ArrayManager(new int[] { 5, 6, 7, 8, 9 });

                ArrayUtility.printTitle("Initial Array");

                TraverseOperation.forward(manager.getArray());

                ArrayUtility.printTitle("Insert Operations");

                manager.setArray(
                                InsertOperation.atBeginning(
                                                manager.getArray(),
                                                100));

                manager.setArray(
                                InsertOperation.atPosition(
                                                manager.getArray(),
                                                200,
                                                3));

                manager.setArray(
                                InsertOperation.atEnd(
                                                manager.getArray(),
                                                300));

                ArrayUtility.printTitle("Modify Operations");

                ModifyOperation.update(
                                manager.getArray(),
                                0,
                                111);

                ModifyOperation.update(
                                manager.getArray(),
                                2,
                                222);

                ModifyOperation.update(
                                manager.getArray(),
                                manager.getArray().length - 1,
                                333);

                ArrayUtility.printTitle("Traversal");

                System.out.println("Forward Traversal:");
                TraverseOperation.forward(manager.getArray());

                System.out.println("\nReverse Traversal:");
                TraverseOperation.reverse(manager.getArray());

                ArrayUtility.printTitle("Search");

                System.out.print("array -> ");
                ArrayUtility.printArray(manager.getArray());
                int index = SearchOperation.linearSearch(
                                manager.getArray(),
                                222);

                if (index != -1) {
                        System.out.println("Target found at index : " + index);
                } else {
                        System.out.println("Target not found!");
                }

                ArrayUtility.printTitle("Delete Operations");

                manager.setArray(
                                DeleteOperation.atBeginning(
                                                manager.getArray()));

                manager.setArray(
                                DeleteOperation.atPosition(
                                                manager.getArray(),
                                                2));

                manager.setArray(
                                DeleteOperation.atEnd(
                                                manager.getArray()));

                System.out.println("Final Array:");
                TraverseOperation.forward(manager.getArray());
        }
}
