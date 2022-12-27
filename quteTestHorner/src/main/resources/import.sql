-- NODE_TYPE
INSERT INTO node_type (desc_eng, desc_ger) VALUES ('inverter','Wechselrichter');
INSERT INTO node_type (desc_eng, desc_ger) VALUES ('solar-panel','Solar-Paneel');
INSERT INTO node_type (desc_eng, desc_ger) VALUES ('battery','Batterie');
INSERT INTO node_type (desc_eng, desc_ger) VALUES ('feed-in','Einspeisung Netz');
INSERT INTO node_type (desc_eng, desc_ger) VALUES ('local-consumer','Lokaler Verbraucher');
INSERT INTO node_type (desc_eng, desc_ger) VALUES ('wallbox','Auto Ladeanschluß');

-- Facility
INSERT INTO facility (name, description, area_width, area_height)
  VALUES ('HTL Leonding', 'Testinstallation an der HTL Leonding', 1000, 500);

