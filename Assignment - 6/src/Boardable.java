
public interface Boardable 
{
	void setBoardStart(int month, int day, int year) throws InvalidArgumentException;
	void setBoardEnd(int month, int day, int year) throws InvalidArgumentException;
	boolean boarding(int month, int day, int year) throws InvalidArgumentException;
}
