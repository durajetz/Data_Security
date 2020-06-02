
public class ds {
    public static void main(String[] args) throws Exception {

        if (args.length < 1 || args.length > 6) {
            System.err.println("Error: Invalid number of arguments provided!");
            System.exit(1);
        }

        if (args[0].equalsIgnoreCase("count")) {
            Arguments.count(args);
        } else if (args[0].equalsIgnoreCase("tap-code")) {
            Arguments.tapcode(args);
        } else if (args[0].equalsIgnoreCase("case")) {
            Arguments.casecmd(args);
        } else if (args[0].equalsIgnoreCase("create-user")) {
            Arguments.usercreate(args);
        } else if (args[0].equalsIgnoreCase("delete-user")) {
            Arguments.userdelete(args);
        } else if (args[0].equalsIgnoreCase("login")) {
            Arguments.login(args);
        }else if (args[0].equalsIgnoreCase("status")) {
            Arguments.status(args);
        } else if (args[0].equalsIgnoreCase("export-key")) {
            Arguments.exportkey(args);
        } else if (args[0].equalsIgnoreCase("import-key")) {
            Arguments.importkey(args);
        } else if (args[0].equalsIgnoreCase("write-message")) {
            Arguments.writemessage(args);
        } else if (args[0].equalsIgnoreCase("read-message")) {
            Arguments.readmessage(args);
        } else {
            System.out.println("Error: Invalid command!\nExpect: <count|case|tap-code|create-user|delete-user|login|status|export-key|import-key|write-message|read-message");
            System.exit(1);
        }
    }

}
