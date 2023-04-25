import java.util.ArrayList;

//Nesse código, achei que fizesse mais sentido aplicar o "SRP", Single Responsibility, dividi as responsabilidades em classes
//menores

public interface Linhas {
	ArrayList<String> Linha();
	
}

public class IniciarTabuleiro {
    ArrayList<String> spots;

    public Tabuleiro() {
        this.spots = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            this.spots.add(" ");
        }
    }
}

public class primeiralinha implements Linhas {
    public ArrayList<String> Linha() {
        ArrayList<String> firstRow = new ArrayList<String>();
        firstRow.add(this.spots.get(0));
        firstRow.add(this.spots.get(1));
        firstRow.add(this.spots.get(2));
        return firstRow;
    }
}

public class segundalinha implements Linhas {
    public ArrayList<String> Linha() {
        ArrayList<String> secondRow = new ArrayList<String>();
        secondRow.add(this.spots.get(3));
        secondRow.add(this.spots.get(4));
        secondRow.add(this.spots.get(5));
        return secondRow;
    }
}

public class terceiralinha implements Linhas{
    public ArrayList<String> Linha() {
        ArrayList<String> thirdRow = new ArrayList<String>();
        thirdRow.add(this.spots.get(6));
        thirdRow.add(this.spots.get(7));
        thirdRow.add(this.spots.get(8));
        return thirdRow;
    }
}
	
public class VerificarGanhador {
	
	public Boolean verificaGanhador(){
    	if((this.spots.get(0) == this.spots.get(1)) && (this.spots.get(0) == this.spots.get(2))){
    		return true;
    	}else if ((this.spots.get(3) == this.spots.get(4)) && (this.spots.get(3) == this.spots.get(5))) {
			return true;
    	}else{
    		return false;
    	}
    }
	
}
    

    
    public void display() {
        String tabuleiroFormatado = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n" + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n" + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8);
        System.out.print(tabuleiroFormatado);
    }
}
