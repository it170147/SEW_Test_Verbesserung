package at.htl.control;

import at.htl.entity.*;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;

@ApplicationScoped
public class InitBean {

    @Inject
    FacilityRepository facilityRepository;

    @Inject
    CircleRepository circleRepository;

    @Inject
    NodeTypeRepository nodeTypeRepository;

    @Inject
    LineConfigRepository lineConfigRepository;

    @Transactional
    void startup(@Observes StartupEvent event) {

        var facility = facilityRepository.find("name","HTL Leonding").firstResult();
        var nodeType = nodeTypeRepository.findById("inverter");

        var inverter = new Circle(
            "inverter",
            "inverter",
                facility,
                null,
                nodeType,
                DeviceType.PRODUCER,
                "/img/voltmeter-power-svgrepo-com.svg",
                "inverter",
                null,
                null,
                400,
                200,
                50,
                5,
                "grey"
        );
        circleRepository.persist(inverter);

        var solarPanelLineConfig = new LineConfig(
            "powerline-producer",
            200,
            200,
            400,
            200,
            "black",
             5,
             5,
             100
        );

        var solarPanel = new Circle(
                "solar-panel",
                "solar-panel",
                facility,
                "Solar Paneele der Fa. SolarEdge, Fronius oder was auch immer.",
                nodeType,
                DeviceType.PRODUCER,
                "/img/solar-panel-svgrepo-com.svg",
                "solar-panel",
                inverter,
                solarPanelLineConfig,
                200,
                200,
                50,
                5,
                "grey"
        );
        circleRepository.persist(solarPanel);

        var feedInLineConfig = new LineConfig(
                "powerline-consumer",
                600,
                100,
                400,
                200,
                "black",
                5,
                5,
                100
        );



        var feedIn = new Circle(
                "feed-in",
                "feed-in",
                facility,
                "Einspeisung in das öffentliche Leitungsnetz",
                nodeType,
                DeviceType.CONSUMER,
                "/img/electric-tower-tower-svgrepo-com.svg",
                "feed-in",
                inverter,
                feedInLineConfig,
                600,
                100,
                50,
                5,
                "grey"
        );
        circleRepository.persist(feedIn);

        var wallBoxLineConfig = new LineConfig(
                "powerline-consumer",
                600,
                300,
                400,
                200,
                "black",
                5,
                5,
                100
        );



        var wallBox = new Circle(
                "wallbox",
                "wallbox",
                facility,
                "Laden des Autos an der Wallbox",
                nodeType,
                DeviceType.CONSUMER,
                "/img/gas-station-fuel-svgrepo-com.svg",
                "wallbox",
                inverter,
                wallBoxLineConfig,
                600,
                300,
                50,
                5,
                "grey"
        );
        circleRepository.persist(wallBox);

    }

}
