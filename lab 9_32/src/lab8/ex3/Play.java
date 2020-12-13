package lab8.ex3;

public class Play implements Runnable {
    private Window mainWindow;
    private String[] abcArgs;
    private static int counter = 0;

    Play(String []args){
        abcArgs=args;
        mainWindow=new Window(args[0]);
        while (true)
            run();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
            counter = (counter + 1) % abcArgs.length;
            mainWindow.selectPicture(abcArgs[counter]);
            mainWindow.paint(mainWindow.getGraphics());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
