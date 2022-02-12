import 'package:flutter/material.dart';

class RatingStars extends StatelessWidget {
  double rating;

  // named constructor with scale 0-maxValue scores to the 5 stars range
  RatingStars.withDivider(double _rating, double _maxValue) {
    this.rating = _rating * (5 / _maxValue);
  }

  // default constructor with scale 0-5 scores to the 5 stars range
  RatingStars(this.rating);

  Row _rate(double _rating) {
    if (_rating < 1) {
      return Row(
        children: [
          Icon(Icons.star_half_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating == 1) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating < 2) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_half_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating == 2) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating < 3) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_half_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating == 3) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outline_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating < 4) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_half_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating == 4) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outline_outlined),
        ],
      );
    } else if (_rating < 5) {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_half_outlined),
        ],
      );
    } else {
      return Row(
        children: [
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
          Icon(Icons.star_outlined),
        ],
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return _rate(rating);
  }
}
