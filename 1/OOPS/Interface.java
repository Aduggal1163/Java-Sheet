// Interface.java
package OOPS;
public class Interface {
        public static void main(String[] args) {
            Queen q=new Queen();
            q.moves();
        }
}
//isme abstraction aise perform hua bhi humne btaya vi chess players ke moves hote hai but humne unkoo implement ni kiya kyuki hr chess player ke moves alg alg hote hai aur vohh khud define krege bhi hamare moves kaise hota aa
interface ChessPlayer{
    void moves(); // yeh function by default public  abstract bhi hai or chessplayer ke andr hum iski implementation ni kar sakte
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("in all 4dir");
    }
}
class Rock implements ChessPlayer{
    public void moves(){
        System.out.println("in 2dir");
    }
}
