public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
@Override
public void visit(Computer computer) {
System.out.println("DisplayingComputer.");
}
@Override
public void visit(Mouse mouse) {
System.out.println("Displaying Mouse.");
}
@Override
public void visit(Keyboard keyboard) {
System.out.println("DisplayingKeyboard.");
}
@Override
public void visit(Monitor monitor) {
System.out.println("Displaying Monitor.");
}
}