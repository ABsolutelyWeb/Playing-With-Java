package reporting;

import com.sun.media.jfxmedia.control.VideoFormat;

public class ReportFomatter {

    String output;

    public ReportFomatter(Object object, VideoFormat.FormatType formatType) {
        switch (formatType) {
            case XML:
                convertObjToXML(object);
                break;
            case CSV:
                convertObjToCSV(object);
                break;
        }
    }

    private String convertObjToXML(Object object){
        return "XML <title>" + object.toString() + "</title>";
    }

    private String convertObjToCSV(Object object){
        return "CSV : ,,," + object.toString() + "....";
    }

    private String getOutput() {
        return output;
    }


}