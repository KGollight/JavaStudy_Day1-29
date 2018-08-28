package array2d;

public class Quiz06 {

	public static void main(String[] args) {
		/* ����ã��
         * <������Ģ>
              [1] ���� ũ��� 9�� 9ĭ(�ʺ��ڿ�)�̸� ���´� ���� �迭�Դϴ�
             [2] ��ź�� ������ 20���̸� ���ǻ� ���� 9�� ǥ���մϴ�.
             [3] ��ź�� ���� ���� �� ������ ������ ��ġ�� �������ϴ�
             [4] ��ź���� ��ġ�� ������ 1���� ���� ����� �ּ���
             [5] ��ź�� ���� ��ġ�� ������ ����ִ� ĭ�� ���ڸ� ä���־�� �մϴ�
                  ���ڴ� �ش� ĭ �ֺ� 8ĭ�� �����ϴ� ��ź �����Դϴ�.
             [6] ���ڱ��� ��ġ�� �Ϸ�Ǹ� ȭ�鿡 ������ ����� �ּ���
         * */
        int size = 9;    // ��, ĭ ��
        int bomb = 20;    // ��ź ��
        int bNum = 9;    // ��ź ��ȣ
        int[][] map = new int[size][size];
        
        // �ʿ� ��ź ��ġ
        for(int i=1; i<=bomb; i++){
            int x = (int)(Math.random()*size);
            int y = (int)(Math.random()*size);
            
            if(map[x][y]==0){
                map[x][y]=bNum;
            }
            else
                i--;
        }
        
        // ��ź ��ġ�� �� ���
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n================================================\n\n");
 
        // ��ź�� ���� ��ġ�� ������ ����ִ� ĭ�� ���ڸ� ä���־�� �մϴ�
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                int up=i-1, down=i+1;
                int left=j-1, right=j+1;
                
                if(map[i][j]!=bNum){                            // ��ź ��ġ ������ �ǳʶ�
                    if(up!=-1 && left!=-1){                        // ��, ���� �˻�
                        if(map[up][left]==bNum)
                            map[i][j]++;
                    }
                    if(up!=-1){                                    // �� �� �˻�
                        if(map[up][j]==bNum)
                            map[i][j]++;
                    }
                    if(up!=-1 && right!=map.length){            // ��, ������ �˻�
                        if(map[up][right]==bNum)
                            map[i][j]++;
                    }
                    if(left!=-1){                                // ���� �� �˻�
                        if(map[i][left]==bNum)
                            map[i][j]++;
                    }
                    if(right!=map.length){                        // ������ �� �˻�
                        if(map[i][right]==bNum)
                            map[i][j]++;
                    }
                    if(down!=map.length && left!=-1){            // �Ʒ�, ���� �˻�
                        if(map[down][left]==bNum)
                            map[i][j]++;
                    }
                    if(down!=map.length){                        // �Ʒ� �� �˻�
                        if(map[down][j]==bNum)
                            map[i][j]++;
                    }
                    if(down!=map.length && right!=map.length){    // �Ʒ�, ������ �˻�
                        if(map[down][right]==bNum)
                            map[i][j]++;
                    }
                }
            }
        }
        
        // �� ���
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
 
}