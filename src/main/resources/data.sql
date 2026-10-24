-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('s623888@student.wroclaw.merito.pl',   'Filip',   'USER',    current_timestamp),
    ('s401566@student.wroclaw.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('wrx81888@student.wroclaw.merito.pl',  'Bartosz',  'USER',    current_timestamp),
    ('name@example.com',       'Firma', 'PARTNER', current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

-- ===== LAB 02 · desk =====
insert into desk (code, desk_type, daily_fee, active, floor, zone, has_dual_monitor, has_docking_station) values
    ('DESK-A01', 'HOT_DESK', 20.00, true, 1, 'A', true, true),
    ('DESK-A02', 'STANDING_DESK', 35.00, true, 1, 'A', true, true),
    ('DESK-S01', 'SILENT_ZONE', 25.00, true, 2, 'S', false, true),
    ('DESK-D02', 'DEDICATED', 50.00, true, 2, 'D', true, true);

-- ===== LAB 02 · office_room =====
insert into office_room (name, capacity, floor, has_video_conference, description) values
    ('Sala Wroclaw', 10, 1, true, 'Sala konferencyjna z systemem Teams Rooms i ekranem 75 cali'),
    ('Focus Room 1', 2, 1, false, 'Maly pokoj do pracy w skupieniu lub krotkich rozmow'),
    ('Kreatywna', 6, 2, true, 'Sala warsztatowa z tablica suchoscieralna i kamera 360');

-- ===== LAB 02 · desk_booking =====
insert into desk_booking (resource_code, user_email, booking_date, status, notes) values
    ('DESK-A01', 's623888@student.wroclaw.merito.pl', '2026-11-02', 'CONFIRMED', 'Rezerwacja calodzienna na prace projektowa'),
    ('DESK-A02', 's401566@student.wroclaw.merito.pl', '2026-11-02', 'CHECKED_IN', 'Praca przy biurku regulowanym'),
    ('DESK-S01', 'wrx81888@student.wroclaw.merito.pl', '2026-11-03', 'CONFIRMED', 'Potrzebna strefa ciszy do analizy kodu');
