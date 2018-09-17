package tr1nks.controller.person;

import tr1nks.controller.Controller;

public interface PersonController extends Controller {
    String VIEW_BASE = "person/";
    String URL_BASE = "/person/";

    String STUDENT_PAGE_URL = URL_BASE + "student";
    String STUDENT_VIEW_NAME = VIEW_BASE + "student";
    String STUDENT_FILTER_MODEL_NAME = "studentFilterSetModel";
    String STUDENT_SPECIFICATION_SESSION_NAME = "studentFilterSetModel";
}
