public class Formatacao_String {
    public static void main(String[] args) {
        String a = "Olá,";
        String b = "Denis";

        System.out.println(a+" "+b);

        String c = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been " +
                "the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type " +
                "and scrambled it to make a type specimen book. It has survived not only five centuries, but also the " +
                "leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s " +
                "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop " +
                "publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println("Testando meu " +
                "software \nde várias " +
                "formas");
        //impressao com aspas simples
        System.out.println("Ele me disse 'oi'");
        //impressao com aspas duplas
        System.out.println("Ele me disse \"oi\"");
    }
}
