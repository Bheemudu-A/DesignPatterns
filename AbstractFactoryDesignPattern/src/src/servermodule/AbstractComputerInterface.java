package src.servermodule;

//Adding one more layer abstraction for computer which is known as AbstractComputerInterface
public interface AbstractComputerInterface extends Computer{
	Computer createComputer();
	
}
