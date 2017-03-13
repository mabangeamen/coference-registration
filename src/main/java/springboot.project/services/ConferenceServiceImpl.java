package springboot.project.services;

import springboot.project.domain.Attendee;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by livhuwani on 2017/03/13.
 */
public class ConferenceServiceImpl implements ConferenceService {

    private Map<Integer, Attendee> attendees;

    @Override
    public List<Attendee> listAllProducts() {
        return null;
    }

    @Override
    public Attendee getAttendeeById(Integer id) {
        return null;
    }

    @Override
    public Attendee saveOrUpdateAttendee(Attendee attendee) {
        if (attendee != null) {
            if (attendee.getId() == null) {
                attendee.setId(getNextKey());
            }

            attendees.put(attendee.getId(), attendee);
            return attendee;
        } else {
            throw new RuntimeException("Attendee Can't be null");
        }
    }

    @Override
    public void deleteAttendee(Integer id) {

    }

    private Integer getNextKey() {
        return Collections.max(attendees.keySet()) + 1;
    }
}
