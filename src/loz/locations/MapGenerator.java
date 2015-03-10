package loz.locations;

public class MapGenerator{

	public static Location[][] getForest(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_FOREST);
			}
		}

		area[0][0] = new Location(EnumLocation.WALL_FOREST);

		area[0][3] = new Location(EnumLocation.WALL_FOREST);

		area[0][5] = new Location(EnumLocation.WALL_FOREST);

		area[0][8] = new Location(EnumLocation.WALL_FOREST);

		area[1][0] = new Location(EnumLocation.WALL_FOREST);

		area[1][1] = new Location(EnumLocation.WALL_FOREST);

		area[1][3] = new Location(EnumLocation.WALL_FOREST);

		area[1][7] = new Location(EnumLocation.WALL_FOREST);

		area[1][8] = new Location(EnumLocation.WALL_FOREST);

		area[2][0] = new Location(EnumLocation.WALL_FOREST);

		area[2][3] = new Location(EnumLocation.WALL_FOREST);

		area[2][4] = new Location(EnumLocation.WALL_FOREST);

		area[2][5] = new Location(EnumLocation.WALL_FOREST);

		area[2][8] = new Location(EnumLocation.WALL_FOREST);

		area[3][3] = new Location(EnumLocation.WALL_FOREST);

		area[3][5] = new Location(EnumLocation.WALL_FOREST);

		area[4][1] = new Location(EnumLocation.WALL_FOREST);

		area[4][3] = new Location(EnumLocation.WALL_FOREST);

		area[4][5] = new Location(EnumLocation.WALL_FOREST);

		area[4][7] = new Location(EnumLocation.WALL_FOREST);

		area[4][8] = new Location(EnumLocation.WALL_FOREST);

		area[5][0] = new Location(EnumLocation.WALL_FOREST);

		area[5][1] = new Location(EnumLocation.WALL_FOREST);

		area[5][3] = new Location(EnumLocation.WALL_FOREST);

		area[5][7] = new Location(EnumLocation.WALL_FOREST);

		area[6][0] =new Location(EnumLocation.WALL_FOREST);

		area[6][1] = new Location(EnumLocation.WALL_FOREST);

		area[6][7] = new Location(EnumLocation.WALL_FOREST);

		area[7][3] = new Location(EnumLocation.WALL_FOREST);

		area[7][7] = new Location(EnumLocation.WALL_FOREST);

		area[8][0] = new Location(EnumLocation.WALL_FOREST);

		area[8][1] = new Location(EnumLocation.WALL_FOREST);

		area[8][2] = new Location(EnumLocation.WALL_FOREST);

		area[8][3] = new Location(EnumLocation.WALL_FOREST);

		area[9][4] = new Location(EnumLocation.WALL_FOREST);

		area[9][5] = new Location(EnumLocation.WALL_FOREST);

		area[9][6] = new Location(EnumLocation.WALL_FOREST);

		area[9][7] = new Location(EnumLocation.WALL_FOREST);


		return area;

	}
	
	public static Location[][] getMountain(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_MOUNTAIN);
			}
		}

		area[1][0] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[1][1] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[1][2] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[1][3] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[1][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[1][5] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[1][6] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[2][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[2][5] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[2][6] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[2][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[3][2] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[3][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[3][5] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[3][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[4][1] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[4][2] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[4][3] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[4][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[4][5] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[4][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[5][3] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[5][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[5][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[6][2] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[6][3] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[6][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[6][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[7][1] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[7][3] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[7][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[8][8] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[9][0] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[9][1] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[9][2] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[9][3] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[9][4] = new Location(EnumLocation.WALL_MOUNTAIN);

		area[9][5] = new Location(EnumLocation.WALL_MOUNTAIN);
		area[9][6] = new Location(EnumLocation.WALL_MOUNTAIN);
		area[9][7] = new Location(EnumLocation.WALL_MOUNTAIN);
		area[9][8] = new Location(EnumLocation.WALL_MOUNTAIN);
		
		return area;
	}

	public static Location[][] getLake(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_LAKE);
			}
		}
		
		area[0][1] = new Location(EnumLocation.WALL_LAKE);
		area[0][3] = new Location(EnumLocation.WALL_LAKE);
		area[0][7] = new Location(EnumLocation.WALL_LAKE);
		area[1][1] = new Location(EnumLocation.WALL_LAKE);
		area[1][5] = new Location(EnumLocation.WALL_LAKE);
		area[2][1] = new Location(EnumLocation.WALL_LAKE);
		area[2][2] = new Location(EnumLocation.WALL_LAKE);
		area[2][3] = new Location(EnumLocation.WALL_LAKE);
		area[2][4] = new Location(EnumLocation.WALL_LAKE);
		area[2][5] = new Location(EnumLocation.WALL_LAKE);
		area[2][6] = new Location(EnumLocation.WALL_LAKE);
		area[2][7] = new Location(EnumLocation.WALL_LAKE);
		area[2][9] = new Location(EnumLocation.WALL_LAKE);
		area[3][1] = new Location(EnumLocation.WALL_LAKE);
		area[3][4] = new Location(EnumLocation.WALL_LAKE);
		area[3][6] = new Location(EnumLocation.WALL_LAKE);
		area[3][7] = new Location(EnumLocation.WALL_LAKE);
		area[4][1] = new Location(EnumLocation.WALL_LAKE);
		area[4][3] = new Location(EnumLocation.WALL_LAKE);
		area[4][7] = new Location(EnumLocation.WALL_LAKE);
		area[4][8] = new Location(EnumLocation.WALL_LAKE);
		area[5][1] = new Location(EnumLocation.WALL_LAKE);
		area[5][5] = new Location(EnumLocation.WALL_LAKE);
		area[5][7] = new Location(EnumLocation.WALL_LAKE);
		area[6][1] = new Location(EnumLocation.WALL_LAKE);
		area[6][3] = new Location(EnumLocation.WALL_LAKE);
		area[6][4] = new Location(EnumLocation.WALL_LAKE);
		area[6][9] = new Location(EnumLocation.WALL_LAKE);
		area[7][1] = new Location(EnumLocation.WALL_LAKE);
		area[7][6] = new Location(EnumLocation.WALL_LAKE);
		area[8][1] = new Location(EnumLocation.WALL_LAKE);
		area[8][2] = new Location(EnumLocation.WALL_LAKE);
		area[8][4] = new Location(EnumLocation.WALL_LAKE);
		area[8][5] = new Location(EnumLocation.WALL_LAKE);
		area[8][6] = new Location(EnumLocation.WALL_LAKE);
		area[8][7] = new Location(EnumLocation.WALL_LAKE);
		area[8][8] = new Location(EnumLocation.WALL_LAKE);
		area[8][9] = new Location(EnumLocation.WALL_LAKE);
		
		return area;
	}

	public static Location[][] getCastle(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_CASTLE);
			}
		}
		
		area[1][1] = new Location(EnumLocation.WALL_CASTLE);
		area[1][3] = new Location(EnumLocation.WALL_CASTLE);
		area[1][5] = new Location(EnumLocation.WALL_CASTLE);
		area[1][7] = new Location(EnumLocation.WALL_CASTLE);
		area[1][9] = new Location(EnumLocation.WALL_CASTLE);
		area[3][1] = new Location(EnumLocation.WALL_CASTLE);
		area[3][3] = new Location(EnumLocation.WALL_CASTLE);
		area[3][4] = new Location(EnumLocation.WALL_CASTLE);
		area[3][8] = new Location(EnumLocation.WALL_CASTLE);
		area[3][9] = new Location(EnumLocation.WALL_CASTLE);
		area[4][3] = new Location(EnumLocation.WALL_CASTLE);
		area[4][9] = new Location(EnumLocation.WALL_CASTLE);
		area[5][1] = new Location(EnumLocation.WALL_CASTLE);
		area[5][9] = new Location(EnumLocation.WALL_CASTLE);
		area[6][9] = new Location(EnumLocation.WALL_CASTLE);
		area[7][1] = new Location(EnumLocation.WALL_CASTLE);
		area[7][9] = new Location(EnumLocation.WALL_CASTLE);
		area[8][3] = new Location(EnumLocation.WALL_CASTLE);
		area[8][9] = new Location(EnumLocation.WALL_CASTLE);
		area[9][1] = new Location(EnumLocation.WALL_CASTLE);
		area[9][3] = new Location(EnumLocation.WALL_CASTLE);
		area[9][4] = new Location(EnumLocation.WALL_CASTLE);
		area[9][5] = new Location(EnumLocation.WALL_CASTLE);
		area[9][6] = new Location(EnumLocation.WALL_CASTLE);
		area[9][7] = new Location(EnumLocation.WALL_CASTLE);
		area[9][8] = new Location(EnumLocation.WALL_CASTLE);
		area[9][9] = new Location(EnumLocation.WALL_CASTLE);
		
		return area;
	}
		
	public static Location[][] getFieldWest(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_FIELD);
			}
		}
		
		area[3][1] = new Location(EnumLocation.WALL_FIELD);
		area[3][2] = new Location(EnumLocation.WALL_FIELD);
		area[4][1] = new Location(EnumLocation.WALL_FIELD);
		area[5][1] = new Location(EnumLocation.WALL_FIELD);
		area[5][2] = new Location(EnumLocation.WALL_FIELD);
		
		return area;
	}

	public static Location[][] getFieldNorth(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_FIELD);
			}
		}
		
		area[1][3] = new Location(EnumLocation.WALL_FIELD);
		area[1][4] = new Location(EnumLocation.WALL_FIELD);
		area[1][5] = new Location(EnumLocation.WALL_FIELD);
		area[2][3] = new Location(EnumLocation.WALL_FIELD);
		area[2][5] = new Location(EnumLocation.WALL_FIELD);
		
		return area;
	}
	public static Location[][] getFieldMiddle(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_FIELD);
			}
		}
		
		return area;
	}
	public static Location[][] getFieldSouth(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_FIELD);
			}
		}
		
		area[6][3] = new Location(EnumLocation.WALL_FIELD);
		area[6][5] = new Location(EnumLocation.WALL_FIELD);
		area[7][3] = new Location(EnumLocation.WALL_FIELD);
		area[7][4] = new Location(EnumLocation.WALL_FIELD);
		area[7][5] = new Location(EnumLocation.WALL_FIELD);
		
		return area;
	}
	public static Location[][] getFieldEast(){

		Location[][] area = new Location[10][10];

		for(int i = 0; i < area.length; i++){
			for(int j = 0; j < area[0].length; j++){
				area[i][j] = new Location(EnumLocation.PATH_FIELD);
			}
		}
		
		area[3][7] = new Location(EnumLocation.WALL_FIELD);
		area[3][8] = new Location(EnumLocation.WALL_FIELD);
		area[4][8] = new Location(EnumLocation.WALL_FIELD);
		area[5][7] = new Location(EnumLocation.WALL_FIELD);
		area[5][8] = new Location(EnumLocation.WALL_FIELD);
		
		return area;
	}
}