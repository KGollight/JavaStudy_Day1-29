package array2d;

public class Quiz06 {

	public static void main(String[] args) {
		/* 지뢰찾기
         * <생성규칙>
              [1] 맵의 크기는 9줄 9칸(초보자용)이며 형태는 정수 배열입니다
             [2] 폭탄의 개수는 20개이며 편의상 숫자 9로 표시합니다.
             [3] 폭탄은 겹쳐 놓을 수 없으며 랜덤한 위치에 놓여집니다
             [4] 폭탄까지 배치가 끝나면 1차로 맵을 출력해 주세요
             [5] 폭탄에 대한 배치가 끝나면 비어있는 칸에 숫자를 채워넣어야 합니다
                  숫자는 해당 칸 주변 8칸에 존재하는 폭탄 개수입니다.
             [6] 숫자까지 배치가 완료되면 화면에 지도를 출력해 주세요
         * */
        int size = 9;    // 줄, 칸 수
        int bomb = 20;    // 폭탄 수
        int bNum = 9;    // 폭탄 번호
        int[][] map = new int[size][size];
        
        // 맵에 폭탄 배치
        for(int i=1; i<=bomb; i++){
            int x = (int)(Math.random()*size);
            int y = (int)(Math.random()*size);
            
            if(map[x][y]==0){
                map[x][y]=bNum;
            }
            else
                i--;
        }
        
        // 폭탄 배치된 맵 출력
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n================================================\n\n");
 
        // 폭탄에 대한 배치가 끝나면 비어있는 칸에 숫자를 채워넣어야 합니다
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                int up=i-1, down=i+1;
                int left=j-1, right=j+1;
                
                if(map[i][j]!=bNum){                            // 폭탄 설치 지역은 건너뜀
                    if(up!=-1 && left!=-1){                        // 위, 왼쪽 검사
                        if(map[up][left]==bNum)
                            map[i][j]++;
                    }
                    if(up!=-1){                                    // 윗 줄 검사
                        if(map[up][j]==bNum)
                            map[i][j]++;
                    }
                    if(up!=-1 && right!=map.length){            // 위, 오른쪽 검사
                        if(map[up][right]==bNum)
                            map[i][j]++;
                    }
                    if(left!=-1){                                // 왼쪽 줄 검사
                        if(map[i][left]==bNum)
                            map[i][j]++;
                    }
                    if(right!=map.length){                        // 오른쪽 줄 검사
                        if(map[i][right]==bNum)
                            map[i][j]++;
                    }
                    if(down!=map.length && left!=-1){            // 아래, 왼쪽 검사
                        if(map[down][left]==bNum)
                            map[i][j]++;
                    }
                    if(down!=map.length){                        // 아랫 줄 검사
                        if(map[down][j]==bNum)
                            map[i][j]++;
                    }
                    if(down!=map.length && right!=map.length){    // 아래, 오른쪽 검사
                        if(map[down][right]==bNum)
                            map[i][j]++;
                    }
                }
            }
        }
        
        // 맵 출력
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
 
}