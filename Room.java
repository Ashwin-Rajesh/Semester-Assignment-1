public class Room
{
	int NumberOfRooms;
	double MRate;
	double TuRate;
	double WRate;
	double ThRate;
	double FRate;
	double SaRate;
	double SuRate;
	int MinAdult;
	int MinChild;
	int MaxAdult;
	int MaxChild;
	
	
	public Room(int NumberOfRooms, char type)
	{
		this.NumberOfRooms = NumberOfRooms;
	}
	
	/* Set the rates for each day, there is more than likely a better solution, but this will do for now*/
	public SetMRate(double Rate)
	{
		MRate = Rate;
	}
	public SetTuRate(double Rate)
	{
		TuRate = Rate;
	}
	public SetWRate(double Rate)
	{
		WRate = Rate;
	}
	public SetThRate(double Rate)
	{
		ThRate = Rate;
	}
	public SetFRate(double Rate)
	{
		FRate = Rate;
	}
	public SetSaRate(double Rate)
	{
		SaRate = Rate;
	}
	public SetSuRate(double Rate)
	{
		SuRate = Rate;
	}
	
	/* Setting the amount of occupants, again, probably a better solution out there, but this will do for now */
	public SetMinOccupants(MinAdult, MinChild)
	{
		this.MinAdult = MinAdult;
		this.MinChild = MinChild;
	}
	public SetMaxOccupants(MaxAdult, MaxChild)
	{
		this.MaxAdult = MaxAdult;
		this.MaxChild = MaxChild;
	}
}