namespace KolkoIKrzyzyk;

public class Board
{
    // private string[] _topRow = { "#", "#", "#" };
    // private string[] _middleRow = { "#", "#", "#" };
    // private string[] _bottomRow = { "#", "#", "#" };
    private string[] _topRow;
    private string[] _middleRow;
    private string[] _bottomRow;
    private string[][] _rows;
    
    public string[] TopRow { get; }
    public string[] MiddleRow { get; }
    public string[] BottomRow { get; }

    public Board()
    {
        _topRow = new string[3];
        _middleRow = new string[3];
        _bottomRow = new string[3];
        _rows = new string[3][];
        
        _rows[0] = _topRow; 
        _rows[1] = _middleRow;
        _rows[2] = _bottomRow;

        foreach (string[] row in _rows)
        {
            
        }

    }
    
    public void addElement(string row, int column, GameElement element)
    {
        if(getResult() != GameResult.NotFinished)
            throw new Exception("Game has already finished");
            
        string[] chosenRow = rowNametoRowVariable(row);
        int rowIndex = column + 1;
        
        if (chosenRow[rowIndex] == "O" || chosenRow[rowIndex] == "X") 
            throw new Exception("This placement is already occupied");
        
        string stringElement = element == GameElement.Cross ? "X" : "O";
        
        chosenRow[rowIndex] = stringElement;
    }

    void setupStartingBoard()
    {
        foreach (string[] row in _rows)
        {
            for (int i = 0; i < row.Length; i++)
            {
                row[i] = "#";
            }
        }
    }

    GameResult getResult()
    {
        string[] possibleWins =
        {
            // horizontal
            _topRow.ToString(),  // top line
            _middleRow.ToString(), // middle line
            _bottomRow.ToString(), // bottom line
            
            // vertical
            _topRow[0] + _middleRow[0] + _middleRow[0], // left line
            _topRow[1] + _middleRow[1] + _bottomRow[1], // middle line
            _topRow[2] + _middleRow[2] + _bottomRow[2], // right line
            
            // diagonal
            _topRow[0] + _middleRow[1] + _bottomRow[2], // top left -> bottom right
            _topRow[2] + _middleRow[1] + _bottomRow[0], // top right -> bottom left
            
        };
        
        string circleWin = "OOO";
        string crossWin = "XXX";

        foreach (string win in possibleWins)
        {
            if (win == circleWin) return GameResult.CircleWon;
            if (win == crossWin) return GameResult.CrossWon;
            if (hasFreePlacements()) return GameResult.NotFinished;
        }
        return GameResult.Draw;
     
    }

    private bool hasFreePlacements()
    {
        string[][] rows = { _topRow, _middleRow, _bottomRow };

        foreach (string[] row in rows)
        {
            for (int i = 0; i < row.Length; i++)
            {
                if (row[i] == "#")
                {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private string[] rowNametoRowVariable(string row)
    {
        switch (row)
        {
            case "top":
                return _topRow;
            case "middle":
                return _middleRow;
            case "bottom":
                return _bottomRow;
            default:
                throw new ArgumentException();
        }
    }
}