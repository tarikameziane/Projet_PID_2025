CREATE TABLE `shows` (
                         `id` int(11) NOT NULL AUTO_INCREMENT,
                         `slug` varchar(60) COLLATE utf8mb4_unicode_ci NOT NULL UNIQUE,
                         `title` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                         `description` longtext,
                         `poster_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                         `bookable` tinyint(1) NOT NULL,
                         `price` decimal(10,2) DEFAULT NULL,
                         `created_at` datetime(6) NOT NULL,
                         `updated_at` datetime(6) DEFAULT NULL,
                         `location_id` int(11) DEFAULT NULL,
                         PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET= utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Index pour la table `shows`
--
ALTER TABLE `shows`
    ADD KEY `shows_location_id_a6832141_fk_locations_id` (`location_id`);

--
-- Contraintes pour la table `shows`
--
ALTER TABLE `shows`
    ADD CONSTRAINT `shows_location_id_a6832141_fk_locations_id` FOREIGN KEY (`location_id`) REFERENCES `locations` (`id`);
INSERT INTO `shows` (`id`, `slug`, `title`, `description`, `poster_url`, `bookable`, `price`, `created_at`, `updated_at`, `location_id`) VALUES
                                                                                                                                             (1, 'ayiti', 'Ayiti', 'Un homme est bloqué à l’aéroport.\n Questionné par les douaniers, il doit alors justifier son identité, et surtout prouver qu\'il est haïtien – qu\'est-ce qu\'être haïtien ?', 'ayiti.jpg', 1, '9.00', '2020-04-21 19:08:44.583000', NULL, 1),
(2, 'cible-mouvante', 'Cible mouvante', 'Dans ce « thriller d’anticipation », des adultes semblent alimenter et véhiculer une crainte féroce envers les enfants âgés entre 10 et 12 ans.', 'cible.jpg', 1, '9.00', '2020-04-21 19:08:53.156000', NULL, 2),
(3, 'ceci-nest-pas-un-chanteur-belge', 'Ceci n\'est pas un chanteur belge', 'Non peut-être ?!\nEntre Magritte (pour le surréalisme comique) et Maigret (pour le réalisme mélancolique), ce dixième opus semalien propose quatorze nouvelles chansons mêlées à de petits textes humoristiques et à quelques fortes images poétiques.', 'claudebelgesaison220.jpg', 1, '5.50', '2020-04-21 19:08:53.189000', '2020-04-21 19:08:53.189000', NULL),
                                                                                                                                             (4, 'manneke', 'Manneke… !', 'A tour de rôle, Pierre se joue de ses oncles, tantes, grands-parents et surtout de sa mère.', 'wayburn.jpg', 1, '10.50', '2020-04-21 19:09:02.426000', '2020-04-21 19:09:02.426000', 3);
