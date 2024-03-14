public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("MP3", "Máy nghe nhạc", "1234", 100.0f, 200);
        Book book = new Book("Lập trình Java", "Lập trình Java căn bản", "2345", 50.0f, "Phạm Văn Trung", 650, "Programming");

        System.out.println("MP3 Information:");
        mp3.showInfo();

        System.out.println("\nBook Information:");
        book.showInfo();
    }
}
