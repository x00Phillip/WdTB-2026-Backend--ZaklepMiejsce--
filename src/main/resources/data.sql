-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('s623888@student.wroclaw.merito.pl',   'Filip',   'USER',    current_timestamp),
    ('s401566@student.wroclaw.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('wrx81888@student.wroclaw.merito.pl',  'Bartek',  'USER',    current_timestamp),
    ('name@example.com',       'Firma', 'PARTNER', current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);
