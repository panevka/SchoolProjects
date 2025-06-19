namespace KolkoIKrzyzyk;

public class CLI
{
    private readonly Board _board;
    private GameElement currentTurn;

    public CLI()
    {
        _board = new Board();
        pickFirstTurn();
        while (true)
        {
            printBoard();
            pickPlacement();
        }
    }
    
    public void printBoard()
    {
        Console.WriteLine(_board.TopRow);
        Console.WriteLine(_board.MiddleRow);
        Console.WriteLine(_board.BottomRow);
    }

    void pickPlacement()
    {
        string rowInput = "";
        string columnInput = "";
        
        while (true)
        {
            try
            {
                Console.WriteLine("Pick placement for your turn");
                Console.WriteLine("Which row would you like to pick? (top, middle, bottom)");
                rowInput = Console.ReadLine();
                
                Console.WriteLine("Which column would you like to pick? (1, 2, 3)");
                columnInput = Console.ReadLine();
                
                _board.addElement(rowInput, Int32.Parse(columnInput), currentTurn);

                break;
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
        
    }
    
    void pickFirstTurn()
    {
        string input = "";

        while (input != "1" && input != "2")
        {
            Console.WriteLine("Who should play first?");
            Console.WriteLine("1 - Cross");
            Console.WriteLine("2 - Circle");
        
            input = Console.ReadLine();
        
            if(input == "1")
                currentTurn = GameElement.Cross;
            else if (input == "2")
                currentTurn = GameElement.Circle;
        }
        
    }
    
    // void ()
    // {
    //     Console.WriteLine(_board.TopRow);
    //     Console.WriteLine(_board.MiddleRow);
    //     Console.WriteLine(_board.BottomRow);
    // }
}