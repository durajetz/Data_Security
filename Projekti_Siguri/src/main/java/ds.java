
public class ds {
    public static void main(String[] args) throws Exception {
        Arguments arg = new Arguments();

        if (args.length < 2 || args.length > 4) {
            System.err.println("Wrong number of arguments provided!");
            System.exit(1);
        }

        if (args[0].equalsIgnoreCase("count")) {
            arg.count(args);
        } else if (args[0].equalsIgnoreCase("tap-code")) {
           arg.tapcode(args);
        } else if (args[0].equalsIgnoreCase("case")) {
            arg.casecmd(args);
        } else if (args[0].equalsIgnoreCase("create-user")) {
            arg.usercreate(args);
        } else if (args[0].equalsIgnoreCase("delete-user")) {
            arg.userdelete(args);
        } else if (args[0].equalsIgnoreCase("export-key")) {
            arg.exportkey(args);
        } else if (args[0].equalsIgnoreCase("import-key")) {
            arg.importkey(args);
        } else if (args[0].equalsIgnoreCase("write-message")) {
            arg.writemessage(args);
        } else if (args[0].equalsIgnoreCase("read-message")) {
            arg.readmessage(args);
        } else System.out.println("Invalid command!");
    }

}
