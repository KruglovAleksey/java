package phoneBook;

public class program {
    public static void main(String[] args) {
        Tell tell = new Tell();
        tell.add("Vasya", "89525122270");
        tell.add("Vasya", "89525122271");
        tell.add("Petiy", "89525122274");
        tell.add("Petiy", "89525122290");
        tell.add("Petiy", "89525122231");
        tell.add("Petiy", "89525122279");
        tell.add("Vova", "89525121279");
        tell.add("Vova", "89525121279");
        tell.add("Vova", "89525121279");
        tell.find("Vasya");        
        tell.dell("Vova");
        tell.edit("Vasya", "89525122270", "89525122255");
        tell.print();

    }
}


