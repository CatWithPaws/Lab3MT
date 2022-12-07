import java.io.*;

public class TicTacToePlayer {
    public Role Role;

    public String Name;
    public int Wins;

    public TicTacToePlayer(Role _role){
        Role = _role;
        Name = System.console().readLine();
    }
}
