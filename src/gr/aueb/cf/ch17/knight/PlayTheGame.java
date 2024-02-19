package gr.aueb.cf.ch17.knight;

public class PlayTheGame {
    public static void main(String[] args) {
        IKnight grimhold = new Knight();
        IKnight saintGeorge = new Knight();

//        grimhold.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Save the Princess");
//            }
//        });
//
//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                killTheRedDragon();
//            }
//        });

//        grimhold.embarkOnMission(() -> System.out.println("Save the Princess"));
//        saintGeorge.embarkOnMission(() -> killTheRedDragon());

        grimhold.embarkOnMission(PlayTheGame::saveThePrincess);
        saintGeorge.embarkOnMission(PlayTheGame::killTheRedDragon);
    }

    public static void killTheRedDragon(){
        System.out.println("Kill the Red Dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the Princess");
    }
}
