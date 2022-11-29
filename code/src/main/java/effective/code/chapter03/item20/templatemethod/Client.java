package effective.code.chapter03.item20.templatemethod;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        System.out.println(fileProcessor.process());

        FileProcessorCallBack fileProcessorCallBack = new FileProcessorCallBack("number.txt");
        System.out.println(fileProcessorCallBack.process(Integer::sum));
    }
}
