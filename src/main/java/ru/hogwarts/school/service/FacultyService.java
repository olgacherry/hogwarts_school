package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;


public interface FacultyService {
    Faculty addFaculty(Faculty faculty);
    Faculty findFaculty(long id);

    default Faculty editFaculty(long id, Faculty faculty) {
        return null;
    }

    Faculty deleteFaculty(long id);


}
