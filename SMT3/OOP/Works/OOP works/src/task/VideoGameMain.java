package task;

public class VideoGameMain
{
    public static void main(String[] args) {
        VideoGame game = new VideoGame();
        game.id = "69420";
        game.namaMember = "Fuad";
        game.namaGame = "Balorant";
        game.harga = 69_000;
        game.totalHarga(3);
        game.printData();
    }
}
