package lab5.ballplayer;

public class TestPlayer {
    public static void main(String[] args) {
        // Create a ball object
        Ball ball = new Ball(0, 0, 0);

        // Create a player object
        Player player = new Player(10, 5, 5,0);

        System.out.println("Initial position of the ball: " + ball.toString());
        System.out.println("Initial position of the player: (" + player.getX() + "," + player.getY() + "," + player.getZ() + ")");

        // Move the player
        player.move(3, 2);
        System.out.println("Position of the player after moving: (" + player.getX() + "," + player.getY() + "," + player.getZ() + ")");

        // Jump the player
        player.jump(2);
        System.out.println("Position of the player after jumping: (" + player.getX() + "," + player.getY() + "," + player.getZ() + ")");

        // Check if player is near the ball
        boolean isNear = player.near(ball);
        System.out.println("Is the player near the ball? " + isNear);

        // Kick the ball
        player.kick(ball);
        System.out.println("Position of the ball after kicking: " + ball.toString());
    }
}