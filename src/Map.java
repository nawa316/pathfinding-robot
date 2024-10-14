public class Map {

    String[][] map;

    Map(int x, int y){
        this.map = new String[x][y];
    }
    void addMap(String input) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = input;
            }
        }
    }

    void showMap(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.println(map[i][j]);
            }
        }
    }

    void routing(){

    }
}
